package tdd.training.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author 孙继峰
 * @since 2021/9/3
 */

public class DepartmentTest {
    
    public static void main(String[] args) {
        List<Department> allDepartment = new ArrayList<>();
        Department dep1 = new Department(1, 0, "北京总部");
        Department dep3 = new Department(3, 1, "研发中心");
        Department dep4 = new Department(4, 3, "后端研发组");
        Department dep6 = new Department(6, 4, "后端实习生组");
        Department dep7 = new Department(7, 3, "前端研发组");
        Department dep8 = new Department(8, 1, "产品部");
        
        allDepartment.add(dep6);
        allDepartment.add(dep7);
        allDepartment.add(dep8);
        allDepartment.add(dep1);
        allDepartment.add(dep3);
        allDepartment.add(dep4);
        
        List<Department> subDepartments = DepartmentTest.getSub(3, allDepartment);
        for (Department subDepartment : subDepartments) {
            System.out.println(subDepartment);
        }
    }
    
    /**
     * 根据id，获取所有子部门列表(包括隔代子部门，一直到叶子节点) 要求：不能新增参数，不能增加static变量
     */
    public static List<Department> getSub(int id, List<Department> allDepartment) {
        Map<Integer, List<Department>> pidDepartmentMap = allDepartment.stream()
                .collect(Collectors.groupingBy(Department::getPid));
        
        List<Integer> pidList = new ArrayList<>();
        pidList.add(id);
        
        List<Department> res = new ArrayList<>();
        while (!pidList.isEmpty()) {
            List<Department> tempDepartmentList = pidList.stream()
                    .map(pidDepartmentMap::get)
                    .filter(Objects::nonNull)
                    .flatMap(Collection::stream)
                    .collect(Collectors.toList());
            res.addAll(tempDepartmentList);
            pidList.clear();
            pidList = tempDepartmentList.stream().map(Department::getId).collect(Collectors.toList());
        }
        return res;
    }
}

class Department {
    
    /**
     * id
     */
    private int id;
    
    /**
     * parent id
     */
    private int pid;
    
    /**
     * 名称
     */
    private String name;
    
    public Department(int id, int pid, String name) {
        this.id = id;
        this.pid = pid;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getPid() {
        return pid;
    }
    
    public void setPid(int pid) {
        this.pid = pid;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", pid=" + pid + ", name='" + name + '\'' + '}';
    }
}