package com.pluralsight.conferencedemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// annotate as JPA entity
// note: sessions is the name of the database table
@Entity(name = "sessions")
public class Session {
    // name is the same as the database columns, JPA will bind to those columns, no need to annotate them
    // note Java uses camelcase?? do u mean sessionId
    // then you would add @ column annotation on each attribute and mapping it
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long session_id;
    private String session_name;
    private String session_description;
    private Integer session_length;

    // constructor, helps with serialization
    public Session() {
    }

    public Long getSession_id() {
        return session_id;
    }

    public void setSession_id(Long session_id) {
        this.session_id = session_id;
    }

    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

    public String getSession_description() {
        return session_description;
    }

    public void setSession_description(String session_description) {
        this.session_description = session_description;
    }

    public Integer getSession_length() {
        return session_length;
    }

    public void setSession_length(Integer session_length) {
        this.session_length = session_length;
    }
}
