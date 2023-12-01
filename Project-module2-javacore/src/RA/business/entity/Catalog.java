package RA.business.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Catalog implements Serializable {
    private Long catalogId;
    private String catalogName;
    private String descriptionCatalog;
    private LocalDateTime createAt;
    private boolean statusCatalog;

    public Catalog() {
    }

    public Catalog(Long catalogId) {
        this.catalogId = catalogId;
    }

    public Catalog(Long catalogId, String catalogName, String description, boolean status) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptionCatalog = description;
        this.statusCatalog = status;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptionCatalog() {
        return descriptionCatalog;
    }

    public void setDescriptionCatalog(String descriptionCatalog) {
        this.descriptionCatalog = descriptionCatalog;
    }

    public boolean isStatusCatalog() {
        return statusCatalog;
    }


    public void setStatusCatalog(boolean statusCatalog) {
        this.statusCatalog = statusCatalog;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public Long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }

    @Override
    public String toString() {
        return "[" +
                "catalogId=" + catalogId +
                ", catalogName='" + catalogName + '\'' +
                ", description='" + descriptionCatalog + '\'' +
                ", createAt=" + createAt +
                ", status=" + statusCatalog +
                ']';
    }
}
