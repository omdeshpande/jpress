/**
 * 
 */
package com.omdeshpande.frontend.content.service;

import com.omdeshpande.lib.abstracts.BlockAbstract;
import com.omdeshpande.lib.interfaces.EntityMeta;

/**
 * @author Om Deshpande
 *
 */
public class ContentListBlock extends BlockAbstract {
	
	protected int contentType;
	
	protected void setContentType(int contentType) {
		this.contentType = contentType;
	}
	
	public void getContent() {
		int id = 1;
		EntityMeta entityMeta = getDao().get("entityMeta").read(id);
	}

}
