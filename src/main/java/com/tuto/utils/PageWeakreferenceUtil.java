package com.tuto.utils;

import org.jahia.services.content.JCRNodeWrapper;
import org.mvel2.util.Make;

import javax.jcr.RepositoryException;
import java.util.ArrayList;
import java.util.List;

public class PageWeakreferenceUtil {
public static final String META_DESCRIPTION_FIELD = "jcr:title";

    public static Make.List<JCRNodeWrapper> getAllPageByRefSieze(JCRNodeWrapper pageNode) throws RepositoryException {
    List<JCRNodeWrapper> listePage = new ArrayList<>();

        return null;
    }


    public static String getPageDescription(JCRNodeWrapper page) throws RepositoryException {
        StringBuilder result = new StringBuilder();
        if (page != null) {
            if (page.hasProperty(META_DESCRIPTION_FIELD)) {
                result.append(page.getPropertyAsString(META_DESCRIPTION_FIELD));
            } else {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
