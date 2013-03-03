/*
 * ====================================================================
 * Copyright (C) 1997-2008 by Naijatek.com
 *
 * All copyright notices regarding MyAlumni MUST remain 
 * intact in the scripts and in the outputted HTML.
 * The "powered by" text/logo with a link back to
 * http://www.naijatek.com in 
 * the footer of the pages MUST remain visible when the pages
 * are viewed on the internet or intranet.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Support can be obtained from support forums at:
 * http://www.naijatek.com/myalumni/forum
 *
 * Correspondence and Marketing Questions can be sent to:
 * info at naijatek com
 *
 * <p>Title: MyAlumni </p>
 * <p>Description: This system helps keep alive the line of communications between alumni/alumnus</p>
 * <p>Copyright: Copyright (c) 1997-2008</p>
 * <p>Company: Naijatek Solutions (http://www.naijatek.com)</p>
 * @author Folashade Adeyosoye (shardayyy@naijatek.com)
 * @version 1.0
 */
package net.naijatek.myalumni.service.impl;

import java.util.List;

import net.naijatek.myalumni.controller.exceptions.MyAlumniException;
import net.naijatek.myalumni.entity.ReminisceVO;
import net.naijatek.myalumni.persistence.hibernate.iface.ReminisceDao;
import net.naijatek.myalumni.service.IReminisceService;
import net.naijatek.myalumni.util.BaseConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReminisceServiceImpl implements IReminisceService {

    @Autowired
    private ReminisceDao reminisceDao;

/*    public ReminisceServiceImpl(ReminisceDao reminisceDao) {
        this.reminisceDao = reminisceDao;
    }*/

    @Transactional(readOnly = true)
	public List<ReminisceVO> findAll() {
		return reminisceDao.findAll();
	}

    @Transactional(readOnly = true)
	public List<ReminisceVO> findAllByStatus(String status) {
		return reminisceDao.findAllByStatus(status);
	}

    @Transactional(readOnly = true)
	public ReminisceVO findById(String id) {
		return reminisceDao.findById(id);
	}

    @Transactional
	public void hardDelete(String id) throws MyAlumniException {
		reminisceDao.hardDeleteObject(id);
	}

    @Transactional
	public void merge(ReminisceVO entity) {
		reminisceDao.mergeObject(entity);
	}

    @Transactional
	public void save(ReminisceVO entity) {
		entity.setStatus(BaseConstants.APPROVAL_NEEDED);
		reminisceDao.save(entity);
	}

    @Transactional
	public void softDelete(String id, String lastModifiedBy) throws MyAlumniException {
		reminisceDao.softDeleteObject(id, lastModifiedBy);
	}

//	public List<ReminisceVO> findAllByYearOut(int yearOut){
//		return ReminisceDao.findAllByYearOut(yearOut);
//	}
	
	
//	public List<ReminisceVO> findAllByYearOutAndSystemNews(int yearOut){
//		return ReminisceDao.findAllByYearOutAndSystemNews(yearOut);
//	}
	
}
