package com.et.entity;

public class Dept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.gid
     *
     * @mbg.generated Wed Dec 13 09:55:50 CST 2017
     */
    private Integer gid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.ename
     *
     * @mbg.generated Wed Dec 13 09:55:50 CST 2017
     */
    private String ename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.pid
     *
     * @mbg.generated Wed Dec 13 09:55:50 CST 2017
     */
    private Integer pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.gid
     *
     * @return the value of dept.gid
     *
     * @mbg.generated Wed Dec 13 09:55:50 CST 2017
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.gid
     *
     * @param gid the value for dept.gid
     *
     * @mbg.generated Wed Dec 13 09:55:50 CST 2017
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.ename
     *
     * @return the value of dept.ename
     *
     * @mbg.generated Wed Dec 13 09:55:50 CST 2017
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.ename
     *
     * @param ename the value for dept.ename
     *
     * @mbg.generated Wed Dec 13 09:55:50 CST 2017
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.pid
     *
     * @return the value of dept.pid
     *
     * @mbg.generated Wed Dec 13 09:55:50 CST 2017
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.pid
     *
     * @param pid the value for dept.pid
     *
     * @mbg.generated Wed Dec 13 09:55:50 CST 2017
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}