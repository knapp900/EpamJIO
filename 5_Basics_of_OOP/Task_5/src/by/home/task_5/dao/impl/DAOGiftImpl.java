package by.home.task_5.dao.impl;

import java.util.ArrayList;
import java.util.List;

import by.home.task_5.dao.DAOException;
import by.home.task_5.dao.GiftDAO;
import by.home.task_5.entity.Gift;
import by.home.task_5.entity.Packing;

public class DAOGiftImpl implements GiftDAO {

	List<Gift> gifts = new ArrayList<Gift>();

	@Override
	public String getAll() throws DAOException {

		return gifts.toString();
	}

	@Override
	public String getByPackage(Packing packing) throws DAOException {

		List<Gift> giftss = new ArrayList<Gift>();
		
		try {

			for (Gift gift : gifts) {

				if (gift.equals(packing)) {

					giftss.add(gift);
				}
			}
			return giftss.toString();
			
		} catch (Exception e) {

			throw new DAOException(e);
		}

	}

	@Override
	public boolean addGifts(Gift gift) throws DAOException {
		
		try {
			
			gifts.add(gift);
			System.out.println(gifts);
						
			return gifts.add(gift) ? true : false;
			
		} catch (Exception e) {
			
			throw new DAOException(e);
		}
		

	}

}
