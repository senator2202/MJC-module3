package com.epam.esm.model.dao;

import com.epam.esm.model.entity.GiftCertificate;

import java.util.List;

public interface GiftCertificateDao extends BaseDao<GiftCertificate> {
    List<GiftCertificate> findByTagName(String tagName);

    List<GiftCertificate> findByName(String name);

    List<GiftCertificate> findByDescription(String description);

    GiftCertificate updateName(long id, String newName);

    GiftCertificate updateDescription(long id, String newDescription);

    GiftCertificate updatePrice(long id, int newPrice);

    GiftCertificate updateDuration(long id, int newDuration);
}
