package it.main;

import it.Student.Student;
import it.Teacher.Teacher;
import it.utils.utils;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> stu = new ArrayList<>();
        ArrayList<Teacher> tea = new ArrayList<>();
        while (true) {
            System.out.println("1.学生信息管理   2.教师信息管理   3.系统退出");

            System.out.println("请选择菜单:");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    //进入学生信息管理
                    studentManage(stu, sc);
                    break;
                case 2:
                    //进入教师信息管理
                    teacherManage(tea, sc);
                    break;
                case 3:
                    //系统退出
                    System.out.println("谢谢您，欢迎下次使用！");
                    System.exit(0);
                default:
                    System.out.println("您输入有误，请重新输入!");
                    break;
            }
        }//while
    }

    private static void studentManage(ArrayList<Student> stu, Scanner sc) {
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("【学员信息管理】");
            System.out.println("1.添加学员   2.修改学员  3.删除学员  4.查询学员  5.返回");
            System.out.println();
            System.out.println("请输入功能序号");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    //添加学员
                    addStudent(stu, sc);
                    break;
                case 2:
                    //修改学员
                    updateStudent(stu, sc);
                    break;
                case 3:
                    //删除学员
                    deleteStudent(stu, sc);
                    break;
                case 4:
                    //查询学员
                    selectStudent(stu);
                    break;
                case 5:
                    //返回上级
                    return;
                default:
                    System.out.println("您输入有误，请重新输入！");
                    break;
            }
            System.out.println("-------------------------------------");

        }
    }

    //删除学员
    private static void deleteStudent(ArrayList<Student> stu, Scanner sc) {
        System.out.println("请输入要删除的学生编号:");
        int num = sc.nextInt();
        for (int i = 0; i < stu.size(); i++) {
            Student s = stu.get(i);
            if (num == s.getId()) {
                //打印要删除的学生信息
                System.out.println("【您要删除的学生信息如下：】");
                System.out.println("******************************");
                System.out.println("编号" + "\t\t" + "姓名" + "\t\t" + "性别" + "\t\t" + "生日" + "\t\t\t\t" + "年龄" + "\t\t" + "概述");
                utils.printPerson(s);
                //让用户确认是否删除
                System.out.println("【您确认要删除这条信息吗？（y/n）】");
                String op = sc.next();
                //根据用户的选择，进行操作
                if ("y".equalsIgnoreCase(op)) {
                    stu.remove(i);
                    System.out.println("【删除成功】");
                }
                if ("n".equalsIgnoreCase(op)) {
                    System.out.println("【错误】操作取消！");
                }
                return;
            }
        }
    }

    //修改学员
    private static void updateStudent(ArrayList<Student> stu, Scanner sc) {
        System.out.println("请输入要修改学员的编号:");
        int num = sc.nextInt();
        for (int i = 0; i < stu.size(); i++) {
            Student s = stu.get(i);

            if (s.getId() == num) {
                System.out.println("请输入学生姓名（保留原值输入0）:");
                String name = sc.next();

                System.out.println("请输入学生性别（保留原值输入0）:");
                String sex = sc.next();

                System.out.println("请输入学生的出生日期，格式为yyyy-MM-dd(保留原值输入0):");
                String birthday = sc.next();

                if (!"0".equals(name)) {
                    s.setName(name);
                }
                if (!"0".equals(sex)) {
                    s.setSex(sex);
                }
                if (!"0".equals(birthday)) {
                    s.setBirthday(birthday);
                    s.setAge(utils.birthDayToAge(birthday));
                }
                System.out.println("修改成功！");
                return;
            }

        }
        System.out.println("【错误】您要修改的学员不存在");
    }

    //查询学员
    private static void selectStudent(ArrayList<Student> stu) {
        System.out.println("【查询学生】");
        //如果没有学生，提示没有
        if (stu.size() == 0) {
            System.out.println("没有数据！");
            return;
        }
        //有学生，显示所有学生信息
        utils.printArrayList(stu);

    }

    //添加学员
    private static void addStudent(ArrayList<Student> stu, Scanner sc) {
        //输入学生信息
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入学生性别：");
        String sex = sc.next();
        System.out.println("请输入出生日期:");
        String birthday = sc.next();
        //创建学生对象
        Student s = new Student();
        //把学生信息赋值给学生对象属性
        utils.id++;
        s.setId(utils.id);
        s.setName(name);
        s.setSex(sex);
        s.setBirthday(birthday);
        s.setAge(utils.birthDayToAge(birthday));

        //学生对象添加到集合
        stu.add(s);
        //提示添加成功
        System.out.println("添加成功");
    }


    private static void teacherManage(ArrayList<Teacher> tea, Scanner sc) {
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("【教师信息管理】");
            System.out.println("1.添加教师   2.修改教师  3.删除教师  4.查询教师  5.返回");
            System.out.println();
            System.out.println("请输入功能序号");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    //添加教师
                    addTeacher(tea, sc);
                    break;
                case 2:
                    //修改教师
                    updateTeacher(tea, sc);
                    break;
                case 3:
                    //删除教师
                    deleteTeacher(tea, sc);
                    break;
                case 4:
                    //查询教师
                    selectTeacher(tea);
                    break;
                case 5:
                    //返回上级
                    return;
                default:
                    System.out.println("您输入有误，请重新输入！");
                    break;
            }
            System.out.println("-------------------------------------");

        }
    }

    private static void selectTeacher(ArrayList<Teacher> tea) {
        System.out.println("【查询老师】");
        if (tea.size() == 0) {
            System.out.println("没有数据!");
            return;
        }
        utils.printArrayList(tea);
    }

    private static void deleteTeacher(ArrayList<Teacher> tea, Scanner sc) {
        System.out.println("请输入要删除老师的编号:");
        int num = sc.nextInt();
        for (int i = 0; i < tea.size(); i++) {
            Teacher t = tea.get(i);
            if (num == t.getId()) {
                System.out.println("【您要删除的老师信息如下】");
                System.out.println("*****************************************");
                System.out.println("编号" + "\t\t" + "姓名" + "\t\t" + "性别" + "\t\t" + "生日" + "\t\t\t\t" + "年龄" + "\t\t" + "概述");
                utils.printPerson(t);
                System.out.println("【您确认要删除这条信息吗？（y/n）】");
                String op = sc.next();
                if ("y".equalsIgnoreCase(op)) {
                    tea.remove(i);
                    System.out.println("删除成功!");
                }
                if ("n".equalsIgnoreCase(op)) {
                    System.out.println("【错误】取消操作!");
                }
                return;
            }
        }
    }

    private static void updateTeacher(ArrayList<Teacher> tea, Scanner sc) {
        System.out.println("请输入要修改教师的编号:");
        int num = sc.nextInt();
        for (int i = 0; i < tea.size(); i++) {
            Teacher t = tea.get(i);
            if (num == t.getId()) {
                System.out.println("请输入老师姓名（保留原值输入0）:");
                String name = sc.next();
                System.out.println("请输入老师性别（保留原值输入0）:");
                String sex = sc.next();
                System.out.println("请输入老师出生日期，格式yyyy-MM-dd(保留原值输入0):");
                String birthday = sc.next();

                if (!"0".equals(name)) {
                    t.setName(name);
                }
                if (!"0".equals(sex)) {
                    t.setSex(sex);
                }
                if (!"0".equals(birthday)) {
                    t.setBirthday(birthday);
                    t.setAge(utils.birthDayToAge(birthday));
                }
                System.out.println("修改成功！");
                return;
            }
        }
    }

    private static void addTeacher(ArrayList<Teacher> tea, Scanner sc) {
        System.out.println("请输入老师姓名:");
        String name = sc.next();
        System.out.println("请输入老师性别:");
        String sex = sc.next();
        System.out.println("请输入老师出生日期，格式yyyy-MM-dd:");
        String birthday = sc.next();

        Teacher t = new Teacher();
        utils.tid++;
        t.setId(utils.tid);
        t.setName(name);
        t.setSex(sex);
        t.setBirthday(birthday);
        t.setAge(utils.birthDayToAge(birthday));
        tea.add(t);
        System.out.println("添加成功!");
    }


}
