package com.techexplore.domainProcessor.domainCrawler;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Domain implements Serializable {
    String domain;
    String create_date;
    String update_date;
    String country;
    boolean isDead;
    String A;
    String NS;
    String CNAME;
    String MX;
    String TXT;
}
