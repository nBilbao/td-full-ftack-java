package com.nbilbao.stackOverflow.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="questions")
public class Questions {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuestions;

    /** The first name. */
    private String question;

    /** The Tags. */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "tags_questions",
            joinColumns = @JoinColumn(name = "questions_id"),
            inverseJoinColumns = @JoinColumn(name = "tags_id")
    )
    private List<Tags> tags;

    /** The created at. */
    @Column(updatable=false)
    private Date createdAt;

    /** The updated at. */
    private Date updatedAt;




    /**
     * @return the tags
     */
    public List<Tags> getTags() {
        return tags;
    }
    /**
     * @param tags the tags to set
     */
    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }
    /**
     * @return the idQuestions
     */
    public Long getIdQuestions() {
        return idQuestions;
    }
    /**
     * @param idQuestions the idQuestions to set
     */
    public void setIdQuestions(Long idQuestions) {
        this.idQuestions = idQuestions;
    }
    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }
    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }
    /**
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }
    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    /**
     * @return the updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }
    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}

