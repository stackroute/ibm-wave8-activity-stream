package com.stackroute.domain;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.stackroute.model.TwitterURL;

@JsonFilter("twitterURLfilter")
public class TwitterURL1 extends TwitterURL {
    public TwitterURL1() {
        super();
    }

    public TwitterURL1(String url, String expanded_url, String display_url, int[] indices) {
        super(url, expanded_url, display_url, indices);
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
    public String getExpanded_url() {
        return super.getExpanded_url();
    }

    @Override
    public void setExpanded_url(String expanded_url) {
        super.setExpanded_url(expanded_url);
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
    public int[] getIndices() {
        return super.getIndices();
    }

    @Override
    public void setIndices(int[] indices) {
        super.setIndices(indices);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public SimpleFilterProvider twitterURLFilter() throws JsonProcessingException {
        SimpleFilterProvider filterProvider = new SimpleFilterProvider();
        filterProvider.addFilter("twitterURLfilter",
                SimpleBeanPropertyFilter.filterOutAllExcept("id_str", "media_url","display_url"));
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setFilterProvider(filterProvider);
        TwitterURL1 twitterURL1=new TwitterURL1();
        twitterURL1.setUrl(twitterURL1.getUrl());
        twitterURL1.setExpanded_url(twitterURL1.getExpanded_url());
        twitterURL1.setDisplay_url(twitterURL1.getDisplay_url());
        twitterURL1.setIndices(twitterURL1.getIndices());

        String string=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(twitterURL1);

        System.out.println(string);
        return filterProvider;
    }
}
