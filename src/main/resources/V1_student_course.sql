CREATE TABLE student-course(
    student-id Not Null Foreign Key REFERENCES  Student(id),
    course-id Not Null Foreign Key REFERENCES  Course(id),
)