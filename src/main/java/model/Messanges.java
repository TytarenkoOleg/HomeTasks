package model;

import java.sql.Timestamp;

public class Messanges {
    private Long id;
    private String text;
    private Long idfrom;
    private Long idto;
    private Timestamp date;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getIdfrom() {
        return idfrom;
    }

    public void setIdfrom(Long idfrom) {
        this.idfrom = idfrom;
    }

    public Long getIdto() {
        return idto;
    }

    public void setIdto(Long idto) {
        this.idto = idto;
    }

    public Messanges(Long id, String text, Long idfrom, Long idto, Timestamp date) {
        this.id = id;
        this.text = text;
        this.idfrom = idfrom;
        this.idto = idto;
        this.date = date;
    }

    public Messanges() {

    }

    public Messanges(Long id, String text, Long idfrom, Long idto) {
        this.id = id;
        this.text = text;
        this.idfrom = idfrom;
        this.idto = idto;
        this.date = new Timestamp(System.currentTimeMillis());
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
