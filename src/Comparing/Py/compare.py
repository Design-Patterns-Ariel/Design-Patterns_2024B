class Student:

    def __init__(self,name:str,last_name:str,grade:int,courses:list)->None:
        self.name=name
        self.last_name=last_name
        self.grade:int=grade
        self.courses=courses

    
    def __eq__(self, other):
        if not isinstance(other,Student):
            raise Exception("invalid Argument")
        return self.grade == other.grade
        


s = Student("barak","S",50,[])
s1 = Student("barak","S",50,[])


students = [s, s1]

sorted(students,cmp=lambda x,y: x.grade-y.grade)
try:
   print(s==s1)
except Exception as e:
    print(e)
