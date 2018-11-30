import json

json_str = '[{"name":"qiyue1", "age":18} \
	,{"name":"qiyue2", "age":18},{"name":"qiyue3", "age":18}]'

student = json.loads(json_str)
print(type(student))
print(student)
print(student[0]['name'])
#print(student['age'])
