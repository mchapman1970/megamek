/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 * 
 *  This program is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU General Public License as published by the Free 
 *  Software Foundation; either version 2 of the License, or (at your option) 
 *  any later version.
 * 
 *  This program is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 *  for more details.
 */
/*
 * Created on Sep 7, 2005
 *
 */
package megamek.common.weapons.battlearmor;

import megamek.common.TechConstants;
import megamek.common.weapons.TAGWeapon;


/**
 * @author Sebastian Brocks This servers both as the Fa-Shih's Light TAG and the
 *         Kage's IS Compact TAG, as the stats are the same.
 */
public class ISBALightTAG extends TAGWeapon {

    /**
     * 
     */
    private static final long serialVersionUID = 3038539726901030186L;

    public ISBALightTAG() {
        super();
        this.name = "TAG (Light)";
        setInternalName("ISBALightTAG");
        this.addLookupName("IS BA Light TAG");
        this.tonnage = 0.035f;
        this.criticals = 1;
        this.hittable = true;
        this.spreadable = false;
        this.heat = 0;
        this.damage = 0;
        this.shortRange = 3;
        this.mediumRange = 6;
        this.longRange = 9;
        this.extremeRange = 12;
        this.bv = 0;
        this.cost = 40000;
        flags = flags.or(F_NO_FIRES).or(F_BA_WEAPON).andNot(F_MECH_WEAPON).andNot(F_TANK_WEAPON).andNot(F_AERO_WEAPON).andNot(F_PROTO_WEAPON);
        introDate = 3046;
        techLevel.put(3046, TechConstants.T_IS_EXPERIMENTAL);
        techLevel.put(3053, TechConstants.T_IS_ADVANCED);
        techLevel.put(3057, TechConstants.T_IS_TW_NON_BOX);
        availRating = new int[] { RATING_X ,RATING_X ,RATING_F ,RATING_E};
        techRating = RATING_E;
        rulesRefs = "270, TM";
    }
}
