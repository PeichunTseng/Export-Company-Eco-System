/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.helper;

import java.util.ArrayList;



/**
 *
 * @author raoyuhuizi
 * This List shows all countries' assignment situation;
 * Such as if is assigned,who is assigned.
 */
public class CtyDetailDirectory {
    private ArrayList<CtyDetail> ctyDetailList;
    public CtyDetailDirectory(){
        ctyDetailList=new ArrayList();
    }

    public ArrayList<CtyDetail> getCtyDetailList() {
        return ctyDetailList;
    }
    
    
}
