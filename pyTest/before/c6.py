import json

student = [
            {"name":"qiyue1", "age":18},
            {"name":"qiyue2", "age":18}
          ]
          
json_str = json.dumps(student)
print(json_str)
