package com.yuxie.smsbomb.bean;


import java.io.Serializable;


/**
 * Created by luo on 2018/3/3.
 */
public class SmsApi implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String type;
    private String url;
    private String parameterBefore;
    private String parameterAfter;
    private String resultOk;

    public SmsApi(Long id, String type, String url, String parameterBefore,
                  String parameterAfter, String resultOk) {
        this.id = id;
        this.type = type;
        this.url = url;
        this.parameterBefore = parameterBefore;
        this.parameterAfter = parameterAfter;
        this.resultOk = resultOk;
    }

    public SmsApi() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParameterBefore() {
        return this.parameterBefore;
    }

    public void setParameterBefore(String parameterBefore) {
        this.parameterBefore = parameterBefore;
    }

    public String getParameterAfter() {
        return this.parameterAfter;
    }

    public void setParameterAfter(String parameterAfter) {
        this.parameterAfter = parameterAfter;
    }

    public String getResultOk() {
        return this.resultOk;
    }

    public void setResultOk(String resultOk) {
        this.resultOk = resultOk;
    }

    @Override
    public String toString() {
        return "SmsApi{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", parameterBefore='" + parameterBefore + '\'' +
                ", parameterAfter='" + parameterAfter + '\'' +
                ", resultOk='" + resultOk + '\'' +
                '}';
    }
}
