package com.nbilbao.stackOverflow.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="answers")
public class Answers {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnswers;

    /** The first name. */
    private String answers;

    /** The questions. */
    @JoinColumn(name = "id_questions")
    @ManyToOne
    private Questions questions;

    /** The created at. */
    @Column(updatable=false)
    private Date createdAt;

    /** The updated at. */
    private Date updatedAt;


    /**
     * @return the idAnswers
     */
    public Long getIdAnswers() {
        return idAnswers;
    }
    /**
     * @param idAnswers the idAnswers to set
     */
    public void setIdAnswers(Long idAnswers) {
        this.idAnswers = idAnswers;
    }
    /**
     * @return the answers
     */
    public String getAnswers() {
        return answers;
    }
    /**
     * @param answers the answers to set
     */
    public void setAnswers(String answers) {
        this.answers = answers;
    }
    /**
     * @return the questions
     */
    public Questions getQuestions() {
        return questions;
    }
    /**
     * @param questions the questions to set
     */
    public void setQuestions(Questions questions) {
        this.questions = questions;
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
