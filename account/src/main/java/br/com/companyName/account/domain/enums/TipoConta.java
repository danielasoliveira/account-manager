package br.com.companyName.account.domain.enums;

public enum TipoConta {
    CURRENT(0, "Current"),
    SAVING(1, "Saving");

    private int code;
    private String description;

    private TipoConta(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
