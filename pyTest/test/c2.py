class ListNode:
	def __init__(self, x):
		self.val = x
		self.next = None



class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        rst = ListNode(0)
        cur = rst
        carry = 0
        add = lambda x, y : x + y
        while (l1 is not None) or (l2 is not None):
            x = 0 if l1 is None else l1.val
            y = 0 if l2 is None else l2.val
            
            rst_int = add(x, y) + carry
            #print(add(x,y))
            carry = int(rst_int/10)
            #print(carry)
            
            #cur.val = int(rst_int%10)
            #print(cur.val)
            #print()
            cur.next = ListNode(rst_int%10)
            cur = cur.next
            if l1 is not None:
                l1 = l1.next
            if l2 is not None:
                l2 = l2.next
            if carry > 0:
                cur.next = ListNode(carry)
		
        return rst.next
			
		
l1 = ListNode(5)
#l1.next = ListNode(4)
#l1.next.next = ListNode(3)
l2 = ListNode(5)
#l2.next = ListNode(6)
#l2.next.next = ListNode(4)

s = Solution()
rst = s.addTwoNumbers(l1,l2)
#print('str:' + str(7%10))
while rst is not None:
	print(rst.val)
	rst = rst.next
	
	
