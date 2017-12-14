package com.rms.db.model;

import java.util.Date;

public class Element {
    private Project project;
    private File file;
    private String guid;

    private String story;
    private String epic;

    private String pd;
    private String dev;
    private String qa;

    private String type;
    private String status;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getEpic() {
        return epic;
    }

    public void setEpic(String epic) {
        this.epic = epic;
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public String getQa() {
        return qa;
    }

    public void setQa(String qa) {
        this.qa = qa;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.parent_id
     *
     * @mbg.generated
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.path
     *
     * @mbg.generated
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.type_id
     *
     * @mbg.generated
     */
    private Long typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.status_id
     *
     * @mbg.generated
     */
    private Long statusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.pd_id
     *
     * @mbg.generated
     */
    private Long pdId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.dev_id
     *
     * @mbg.generated
     */
    private Long devId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.qa_id
     *
     * @mbg.generated
     */
    private Long qaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.estimation
     *
     * @mbg.generated
     */
    private Long estimation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.pd_date
     *
     * @mbg.generated
     */
    private Date pdDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.qa_date
     *
     * @mbg.generated
     */
    private Date qaDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.due_date
     *
     * @mbg.generated
     */
    private Date dueDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.tag
     *
     * @mbg.generated
     */
    private String tag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.story_id
     *
     * @mbg.generated
     */
    private Long storyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.epic_id
     *
     * @mbg.generated
     */
    private Long epicId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.is_deleted
     *
     * @mbg.generated
     */
    private Boolean isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column element.notes
     *
     * @mbg.generated
     */
    private String notes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.id
     *
     * @return the value of element.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.id
     *
     * @param id the value for element.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.parent_id
     *
     * @return the value of element.parent_id
     *
     * @mbg.generated
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.parent_id
     *
     * @param parentId the value for element.parent_id
     *
     * @mbg.generated
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.path
     *
     * @return the value of element.path
     *
     * @mbg.generated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.path
     *
     * @param path the value for element.path
     *
     * @mbg.generated
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.name
     *
     * @return the value of element.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.name
     *
     * @param name the value for element.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.type_id
     *
     * @return the value of element.type_id
     *
     * @mbg.generated
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.type_id
     *
     * @param typeId the value for element.type_id
     *
     * @mbg.generated
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.status_id
     *
     * @return the value of element.status_id
     *
     * @mbg.generated
     */
    public Long getStatusId() {
        return statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.status_id
     *
     * @param statusId the value for element.status_id
     *
     * @mbg.generated
     */
    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.pd_id
     *
     * @return the value of element.pd_id
     *
     * @mbg.generated
     */
    public Long getPdId() {
        return pdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.pd_id
     *
     * @param pdId the value for element.pd_id
     *
     * @mbg.generated
     */
    public void setPdId(Long pdId) {
        this.pdId = pdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.dev_id
     *
     * @return the value of element.dev_id
     *
     * @mbg.generated
     */
    public Long getDevId() {
        return devId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.dev_id
     *
     * @param devId the value for element.dev_id
     *
     * @mbg.generated
     */
    public void setDevId(Long devId) {
        this.devId = devId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.qa_id
     *
     * @return the value of element.qa_id
     *
     * @mbg.generated
     */
    public Long getQaId() {
        return qaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.qa_id
     *
     * @param qaId the value for element.qa_id
     *
     * @mbg.generated
     */
    public void setQaId(Long qaId) {
        this.qaId = qaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.estimation
     *
     * @return the value of element.estimation
     *
     * @mbg.generated
     */
    public Long getEstimation() {
        return estimation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.estimation
     *
     * @param estimation the value for element.estimation
     *
     * @mbg.generated
     */
    public void setEstimation(Long estimation) {
        this.estimation = estimation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.pd_date
     *
     * @return the value of element.pd_date
     *
     * @mbg.generated
     */
    public Date getPdDate() {
        return pdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.pd_date
     *
     * @param pdDate the value for element.pd_date
     *
     * @mbg.generated
     */
    public void setPdDate(Date pdDate) {
        this.pdDate = pdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.qa_date
     *
     * @return the value of element.qa_date
     *
     * @mbg.generated
     */
    public Date getQaDate() {
        return qaDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.qa_date
     *
     * @param qaDate the value for element.qa_date
     *
     * @mbg.generated
     */
    public void setQaDate(Date qaDate) {
        this.qaDate = qaDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.due_date
     *
     * @return the value of element.due_date
     *
     * @mbg.generated
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.due_date
     *
     * @param dueDate the value for element.due_date
     *
     * @mbg.generated
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.tag
     *
     * @return the value of element.tag
     *
     * @mbg.generated
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.tag
     *
     * @param tag the value for element.tag
     *
     * @mbg.generated
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.story_id
     *
     * @return the value of element.story_id
     *
     * @mbg.generated
     */
    public Long getStoryId() {
        return storyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.story_id
     *
     * @param storyId the value for element.story_id
     *
     * @mbg.generated
     */
    public void setStoryId(Long storyId) {
        this.storyId = storyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.epic_id
     *
     * @return the value of element.epic_id
     *
     * @mbg.generated
     */
    public Long getEpicId() {
        return epicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.epic_id
     *
     * @param epicId the value for element.epic_id
     *
     * @mbg.generated
     */
    public void setEpicId(Long epicId) {
        this.epicId = epicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.is_deleted
     *
     * @return the value of element.is_deleted
     *
     * @mbg.generated
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.is_deleted
     *
     * @param isDeleted the value for element.is_deleted
     *
     * @mbg.generated
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.create_time
     *
     * @return the value of element.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.create_time
     *
     * @param createTime the value for element.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.update_time
     *
     * @return the value of element.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.update_time
     *
     * @param updateTime the value for element.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column element.notes
     *
     * @return the value of element.notes
     *
     * @mbg.generated
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column element.notes
     *
     * @param notes the value for element.notes
     *
     * @mbg.generated
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}