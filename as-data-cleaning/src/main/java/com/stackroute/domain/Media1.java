package com.stackroute.domain;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.stackroute.model.Media;
import com.stackroute.model.Sizes;

@JsonFilter("mediaFilter")
public class Media1 extends Media {
    public Media1() {
        super();
    }

    public Media1(long id, String id_str, int[] indices, String media_url, String media_url_https, String url, String display_url, String expanded_url, String type, Sizes sizes) {
        super(id, id_str, indices, media_url, media_url_https, url, display_url, expanded_url, type, sizes);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public String getId_str() {
        return super.getId_str();
    }

    @Override
    public void setId_str(String id_str) {
        super.setId_str(id_str);
    }

    @Override
    public int[] getIndices() {
        return super.getIndices();
    }

    @Override
    public void setIndices(int[] indices) {
        super.setIndices(indices);
    }

    @Override
    public String getMedia_url() {
        return super.getMedia_url();
    }

    @Override
    public void setMedia_url(String media_url) {
        super.setMedia_url(media_url);
    }

    @Override
    public String getMedia_url_https() {
        return super.getMedia_url_https();
    }

    @Override
    public void setMedia_url_https(String media_url_https) {
        super.setMedia_url_https(media_url_https);
    }

    @Override
    public String getUrl() {
        return super.getUrl();
    }

    @Override
    public void setUrl(String url) {
        super.setUrl(url);
    }

    @Override
    public String getDisplay_url() {
        return super.getDisplay_url();
    }

    @Override
    public void setDisplay_url(String display_url) {
        super.setDisplay_url(display_url);
    }

    @Override
    public String getExpanded_url() {
        return super.getExpanded_url();
    }

    @Override
    public void setExpanded_url(String expanded_url) {
        super.setExpanded_url(expanded_url);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public Sizes getSizes() {
        return super.getSizes();
    }

    @Override
    public void setSizes(Sizes sizes) {
        super.setSizes(sizes);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public SimpleFilterProvider mediaFilter() throws JsonProcessingException {
        SimpleFilterProvider filterProvider = new SimpleFilterProvider();
        filterProvider.addFilter("mediaFilter",
                SimpleBeanPropertyFilter.filterOutAllExcept("id_str", "media_url","display_url"));
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setFilterProvider(filterProvider);
        Media1 media1=new Media1();
        media1.setId(media1.getId());
        media1.setId_str(media1.getId_str());
        media1.setIndices(media1.getIndices());
        media1.setMedia_url(media1.getMedia_url());
        media1.setMedia_url_https(media1.getMedia_url_https());
        media1.setUrl(media1.getUrl());
        media1.setDisplay_url(media1.getDisplay_url());
        media1.setExpanded_url(media1.getExpanded_url());
        media1.setType(media1.getType());
        media1.setSizes(media1.getSizes());
        String string=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(media1);

        System.out.println(string);
        return filterProvider;

    }
}
