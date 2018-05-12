package com.sh.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author lee leeshuhua@163.com
 * @create 2018-05-06 12:31
 **/

public class EasyUIDataGridResult implements Serializable {
    private long total;
    private List rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
