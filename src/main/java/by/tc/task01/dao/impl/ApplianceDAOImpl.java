package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public Appliance find(Criteria criteria) {
		try (FileReader fr = new FileReader("appliances_db.txt")) {
			Scanner scan = new Scanner(fr);
			Appliance tech;
			while (scan.hasNextLine()) {
				String str = scan.nextLine();
				String techName = criteria.getGroupSearchName();
				switch (techName) {
					case "Laptop": {
						if (checkLaptop(str, criteria) != null) {
							tech = checkLaptop(str, criteria);
							return tech;
						}
						break;
					}
					case "Oven": {
						if (checkOven(str, criteria) != null) {
							tech = checkOven(str, criteria);
							return tech;
						}
						break;
					}
					case "Refrigerator": {
						if (checkRefrigerator(str, criteria) != null) {
							tech = checkRefrigerator(str, criteria);
							return tech;
						}
						break;
					}
					case "Speakers": {
						if (checkSpeakers(str, criteria) != null) {
							tech = checkSpeakers(str, criteria);
							return tech;
						}
						break;
					}
					case "TablesPC": {
						if (checkTabletPC(str, criteria) != null) {
							tech = checkTabletPC(str, criteria);
							return tech;
						}
						break;
					}
					case "VacuumCleaner": {
						if (checkVacuumCleaner(str, criteria) != null) {
							tech = checkVacuumCleaner(str, criteria);
							return tech;
						}
						break;
					}
				}
			}
			fr.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}


	public Laptop checkLaptop(String str, Criteria criteria) {
		boolean checked = true;
		Laptop lap = new Laptop();
		SearchCriteria.Laptop[] laptop = SearchCriteria.Laptop.values();
        for (SearchCriteria.Laptop elem : laptop) {
			String cr = elem.name();
			String val = getValue(str, cr);
			if (!cr.equals("OS")) {
				Double number = Double.parseDouble(val);
				lap.assignCharacteristic(cr, number);
			} else {
				lap.assignCharacteristic(cr, val);
			}
			if (criteria.getCriteria().containsKey(cr)) {
				if (cr.equals("OS")) {
					if (!val.equals(criteria.getCriteria().get(cr))) {
						checked = false;
						break;
					}
				} else {
					Double number = Double.parseDouble(val);
					if (criteria.getCriteria().get(cr) != number) {
						checked = false;
						break;
					}
				}
			}
		}
		if (checked) {
			return lap;
		} else {
			return null;
		}
	}

	public Oven checkOven(String str, Criteria criteria) {
		boolean checked = true;
		Oven oven = new Oven();
		SearchCriteria.Oven[] ovenEnum = SearchCriteria.Oven.values();
		for (SearchCriteria.Oven elem : ovenEnum) {
			String cr = elem.name();
			String val = getValue(str, cr);
			Double number = Double.parseDouble(val);
			oven.assignCharacteristic(cr, number);
			if (criteria.getCriteria().containsKey(cr)) {
				Double num = Double.parseDouble(val);
				if (criteria.getCriteria().get(cr) != num) {
					checked = false;
					break;
				}
			}
		}
		if (checked) {
			return oven;
		} else {
			return null;
		}
	}

	public Refrigerator checkRefrigerator(String str, Criteria criteria) {
		boolean checked = true;
		Refrigerator fridge = new Refrigerator();
		SearchCriteria.Refrigerator[] fridgeEnum = SearchCriteria.Refrigerator.values();
		for (SearchCriteria.Refrigerator elem : fridgeEnum) {
			String cr = elem.name();
			String val = getValue(str, cr);
			Double number = Double.parseDouble(val);
			fridge.assignCharacteristic(cr, number);
			if (criteria.getCriteria().containsKey(cr)) {
				Double num = Double.parseDouble(val);
				if (criteria.getCriteria().get(cr) != num) {
					checked = false;
					break;
				}
			}
		}
		if (checked) {
			return fridge;
		} else {
			return null;
		}
	}

	public Speakers checkSpeakers(String str, Criteria criteria) {
		boolean checked = true;
		Speakers speakers = new Speakers();
		SearchCriteria.Speakers[] speakersEnum = SearchCriteria.Speakers.values();
		for (SearchCriteria.Speakers elem : speakersEnum) {
			String cr = elem.name();
			String val = getValue(str, cr);
			Double number = Double.parseDouble(val);
			speakers.assignCharacteristic(cr, number);
			if (criteria.getCriteria().containsKey(cr)) {
				Double num = Double.parseDouble(val);
				if (criteria.getCriteria().get(cr) != num) {
					checked = false;
					break;
				}
			}
		}
		if (checked) {
			return speakers;
		} else {
			return null;
		}
	}

	public TabletPC checkTabletPC(String str, Criteria criteria) {
		boolean checked = true;
		TabletPC tabletPC = new TabletPC();
		SearchCriteria.TabletPC[] tabEnum = SearchCriteria.TabletPC.values();
		for (SearchCriteria.TabletPC elem : tabEnum) {
			String cr = elem.name();
			String val = getValue(str, cr);
			if (!cr.equals("COLOR")) {
				Double number = Double.parseDouble(val);
				tabletPC.assignCharacteristic(cr, number);
			} else {
				tabletPC.assignCharacteristic(cr, val);
			}
			if (criteria.getCriteria().containsKey(cr)) {
				if (cr.equals("COLOR")) {
					if (!val.equals(criteria.getCriteria().get(cr))) {
						checked = false;
						break;
					}
				} else {
					Double number = Double.parseDouble(val);
					if (criteria.getCriteria().get(cr) != number) {
						checked = false;
						break;
					}
				}
			}
		}
		if (checked) {
			return tabletPC;
		} else {
			return null;
		}
	}

	public VacuumCleaner checkVacuumCleaner(String str, Criteria criteria) {
		boolean checked = true;
		VacuumCleaner cleaner = new VacuumCleaner();
		SearchCriteria.VacuumCleaner[] cleanerEnum = SearchCriteria.VacuumCleaner.values();
		for (SearchCriteria.VacuumCleaner elem : cleanerEnum) {
			String cr = elem.name();
			String val = getValue(str, cr);
			if (!cr.equals("FILTER_TYPE") && !cr.equals("BAG_TYPE") && !cr.equals("WAND_TYPE")) {
				Double number = Double.parseDouble(val);
				cleaner.assignCharacteristic(cr, number);
			} else {
				cleaner.assignCharacteristic(cr, val);
			}
			if (criteria.getCriteria().containsKey(cr)) {
				if (cr.equals("FILTER_TYPE") || cr.equals("BAG_TYPE") || cr.equals("WAND_TYPE")) {
					if (!val.equals(criteria.getCriteria().get(cr))) {
						checked = false;
						break;
					}
				} else {
					Double number = Double.parseDouble(val);
					if (criteria.getCriteria().get(cr) != number) {
						checked = false;
						break;
					}
				}
			}
		}
		if (checked) {
			return cleaner;
		} else {
			return null;
		}
	}

	private String getValue(String str, String cr) {
		StringBuilder value = new StringBuilder("");
		for (int i = str.indexOf(cr) + cr.length() + 1; str.charAt(i) != ',' && i != str.length(); ++i) {
			value.append(str.charAt(i));
		}
		return value.toString();
	}
}