package spring_estudies_jpa_h2.model;

public class OrderDTO {
    private Long idStore;
    private String desc;

    public OrderDTO(Long idStore, String desc) {
        this.idStore = idStore;
        this.desc = desc;
    }

    public Long getIdStore() {
        return idStore;
    }

    public void setIdStore(Long idStore) {
        this.idStore = idStore;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
