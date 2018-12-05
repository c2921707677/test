from queue import Queue
class Solution:
    def updateMatrix(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[List[int]]
        """
        
        # rows = len(matrix)
        # if rows == 0:
        #     return matrix
        # cols = len(matrix[0])
        # rst = [[10001]*cols for i in range(rows)]
        # print(rst)
        # for i in range(rows):
        #     for j in range(cols):
        #         if (matrix[i][j] == 0):
        #             rst[i][j] = 0
        #         else:
        #             for m in range(rows):
        #                 for n in range(cols):
        #                     if (matrix[m][n] == 0):
        #                         distance = abs(m - i) + abs(n - j)
        #                         rst[i][j] = min(rst[i][j], distance)
        # return rst

        rows = len(matrix)
        if rows == 0:
            return matrix
        cols = len(matrix[0])
        # print(rows, cols)
        rst = [[10001]*cols for i in range(rows)]
        q = Queue()
        for x in range(rows):
            for y in range(cols):
                if (matrix[x][y] == 0):
                    rst[x][y] = 0
                    q.put([x,y])
        dirction = (
            (-1,0),
            (1,0),
            (0,-1),
            (0,1)
        )
        while not q.empty():
            temp = q.get()
            for i in range(4):
                new_r = dirction[i][0] + temp[0]
                new_c = dirction[i][1] + temp[1]
                # print(new_r, new_c)
                if (new_c >= 0 and new_r >= 0
                    and new_r < rows and new_c < cols):
                    if rst[new_r][new_c] > rst[temp[0]][temp[1]] + 1:
                        rst[new_r][new_c] = rst[temp[0]][temp[1]] + 1
                        q.put([new_r, new_c])

        return rst




if __name__ == '__main__':
    list = [
        [0],
        [1]
    ]
    print(list)
    s = Solution()
    print(s.updateMatrix(list))
    

