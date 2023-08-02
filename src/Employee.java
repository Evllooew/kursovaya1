public class Employee {
        private static int counter = 0;
        private int id;
        private String fullName;
        private int department;
        private int salary;

        public Employee(String fulName, int department, int salary) {
            this.id = counter++;
            this.fullName = fulName;
            this.department = department;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getFulName() {
            return fullName;
        }

        public int getDepartment() {
            return department;
        }

        public int getSalary() {
            return salary;
        }

        public void setDepartment(int department) {
            this.department = department;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Имя Фамилия: " + fullName + ", Отдел: " + department + ", Зарплата: " + salary;
        }
    }

