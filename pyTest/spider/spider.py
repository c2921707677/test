# coding=utf-8
# urllib import request
import urllib
import re
#爬虫 反爬虫 反反爬虫
#ip 封
#代理ip库

class Spider():
    url = 'https://www.panda.tv/cate/lol?pdt=1.24.s1.3.3m8soagqopc'
    root_pattern = '<div class="video-info">([\s\S]*?)</div>'
    name_pattern = '</i>([\s\S]*?)</span>'
    number_pattern = '<span class="video-number">([\s\S]*?)</span>'

    def __fetch_content(self):
        #r = request.urlopen(Spider.url)
	r = urllib.urlopen(Spider.url)        
	htmls = r.read()
	htmls = str(htmls)
        #htmls = str(htmls, encoding='utf-8')
        return htmls

    def __show(self, anchors):
        for rand in range(0, len(anchors)):
            print('rank ' + str(rand)
                  + ':' + anchors[rand]['name'] + '-------' + anchors[rand]['number'])

    def go(self):
        htmls = self.__fetch_content()
        anchors = self.__analysis(htmls)
        anchors = list(self.__refine(anchors))
        anchors = self.__sort(anchors)
        anchors = self.__sort(anchors)
        self.__show(anchors)
        #print(anchors)


    def __analysis(self, htmls):
        root_html = re.findall(Spider.root_pattern, htmls)
        #print(root_html[0])
        anchors = []
        for html in root_html:
            name = re.findall(Spider.name_pattern, html)
            number = re.findall(Spider.number_pattern, html)
            anchor = {'name': name, 'number': number}
            anchors.append(anchor)
        return anchors

    def __refine(self, anchors):
        l = lambda anchor : {
            'name':anchor['name'][0].strip(),
            'number':anchor['number'][0]
        }
        return map(l, anchors)

    def __sort(self, anchors):
        anchors = sorted(anchors, key = self.__sort_seed, reverse=True)
        return anchors

    def __sort_seed(self, anchor):
        r = re.findall('\d*', anchor['number'])
        number = float(r[0])
        if '万' in anchor['number']:
            number *= 10000
        return number

spider = Spider()
spider.go()
