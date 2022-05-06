package com.ssm.crud.dao;

import com.ssm.crud.bean.Employee;
import com.ssm.crud.bean.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_employee
     *
     * @mbg.generated
     */
    long countByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_employee
     *
     * @mbg.generated
     */
    int deleteByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_employee
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_employee
     *
     * @mbg.generated
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_employee
     *
     * @mbg.generated
     */
    int insertSelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_employee
     *
     * @mbg.generated
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_employee
     *
     * @mbg.generated
     */
    Employee selectByPrimaryKey(Integer employeeId);

    /**
     *  查询出员工信息的同时，也查询出对应的部门信息
     */
    List<Employee> selectByExampleWithDepartment(EmployeeExample example);

    Employee selectByPrimaryKeyWithDepartment(Integer employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_employee
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_employee
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_employee
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_employee
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Employee record);
}