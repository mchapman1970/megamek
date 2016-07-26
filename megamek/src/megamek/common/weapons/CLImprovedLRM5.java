/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
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
package megamek.common.weapons;

import megamek.common.AmmoType;
import megamek.common.TechConstants;

/**
 * @author Sebastian Brocks
 */
public class CLImprovedLRM5 extends LRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 1922843634155860893L;

    /**
     *
     */
    public CLImprovedLRM5() {
        super();

        name = "Improved LRM 5";
        setInternalName(name);
        addLookupName("CLImprovedLRM5");
        addLookupName("CLImpLRM5");
        heat = 2;
        rackSize = 5;
        minimumRange = 6;
        tonnage = 1.0f;
        criticals = 1;
        bv = 45;
        cost = 30000;
        shortAV = 3;
        medAV = 3;
        longAV = 3;
        maxRange = RANGE_LONG;
        ammoType = AmmoType.T_LRM_IMP;
        introDate = 2815;
        extinctDate = 2831;
        reintroDate = 3080;
        techLevel.put(2815, TechConstants.T_CLAN_EXPERIMENTAL);   ///EXP
        techLevel.put(2471, TechConstants.T_CLAN_ADVANCED);   ///ADV
        techLevel.put(2500, TechConstants.T_CLAN_TW);   ///COMMON
        availRating = new int[] { RATING_X, RATING_D, RATING_X, RATING_X };
        techRating = RATING_F;
        rulesRefs = "96, IO";
    }
}
