package com.nbilbao.stackOverflow.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="tags")
public class Tags {


    /** The id tags. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTags;

    /** The first name. */
    private String subject;

    /** The questions. */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "tags_questions",
            joinColumns = @JoinColumn(name = "tags_id"),
            inverseJoinColumns = @JoinColumn(name = "questions_id")
    )
    private List<Questions> questions;

    /** The created at. */
    @Column(updatable=false)
    private Date createdAt;

    /** The updated at. */
    private Date updatedAt;




    /**
     * @return the questions
     */
    public List<Questions> getQuestions() {
        return questions;
    }

    /**
     * @param questions the questions to set
     */
    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }

    /**
     * Gets the id tags.
     *
     * @return the idTags
     */
    public Long getIdTags() {
        return idTags;
    }

    /**
     * Sets the id tags.
     *
     * @param idTags the idTags to set
     */
    public void setIdTags(Long idTags) {
        this.idTags = idTags;
    }

    /**
     * Gets the subject.
     *
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the subject.
     *
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Gets the created at.
     *
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the created at.
     *
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets the updated at.
     *
     * @return the updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the updated at.
     *
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * On create.
     */
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }

    /**
     * On update.
     */
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}