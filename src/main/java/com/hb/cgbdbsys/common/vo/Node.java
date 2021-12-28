package com.hb.cgbdbsys.common.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Node implements Serializable {
    private static final long serialVersionUID = -6577397050669133046L;
    private Integer id;
    private String name;
    private Integer parentId;
}

