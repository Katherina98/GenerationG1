use generationg1;

CREATE TABLE employees (
    emp_id int PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    birth_date DATE,
    first_name varchar(14),
    last_name varchar(16),
    hire_date DATE
);

CREATE TABLE departments (
    dept_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    dept_name varchar (40) 
);

CREATE TABLE dept_manager(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    emp_id int,
    dept_id int, 
    from_date DATE,
    to_date DATE
);

CREATE TABLE dept_emp (
    id int  PRIMARY KEY NOT NULL AUTO_INCREMENT,
    emp_id int,
    dept_id int, 
    from_date DATE,
    to_date DATE
);

;

CREATE TABLE titles (
    emp_id int,
    title varchar (50),
    from_date DATE,
    to_date DATE,
    primary key (title, from_date)
);

CREATE TABLE salaries (
    from_date DATE PRIMARY KEY NOT NULL,
    emp_id int,
    salary int,
    to_date DATE
);

ALTER TABLE salaries
ADD CONSTRAINT FK_employees_id_salaries
FOREIGN KEY (emp_id) references employees (emp_id)
;

ALTER TABLE titles
ADD CONSTRAINT FK_employees_id_titles
FOREIGN KEY (emp_id) references employees (emp_id)
;

ALTER TABLE dept_manager
ADD CONSTRAINT fk_employees_id_dept_manager
FOREIGN KEY (emp_id) references employees (emp_id),
ADD CONSTRAINT fk_dept_id_dept_manager
FOREIGN KEY (dept_id) references departments (dept_id)
;

ALTER TABLE dept_emp
ADD CONSTRAINT FK_employees_id_dept_emp
FOREIGN KEY (emp_id) references employees (emp_id), 
ADD CONSTRAINT FK_dept_id_dept_emp_1
FOREIGN KEY (dept_id) references departments(dept_id)
;


insert into employees (birth_date, firstname, lastname, hire_date) values ('1999-01-10', 'Ana', 'Morales', '2020-10-09')
('1998-02-25', 'Matias', 'Lopez', '2020-05-30');

insert into departments (dept_name) values ('Comercial'), ('Informatica'), ('RRHH');

insert into dept_manager (emp_id, dept_id, from_date, to_date) values (1, 2, '2020-10-10', '2021-05-28');

insert into salaries (from_date, emp_id, salary, to_date) values ('2020-10-10', 1, 500000, '2021-03-30');

insert into titles (emp_id, title, from_date, to_date) values (1, 'Analista programador', '2020-10-10', '2021-03-30');




