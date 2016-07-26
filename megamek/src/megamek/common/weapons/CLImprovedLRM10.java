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
public class CLImprovedLRM10 extends LRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 4015441487276641235L;

    /**
     *
     */
    public CLImprovedLRM10() {
        super();

        name = "Improved LRM 10";
        setInternalName(name);
        addLookupName("CLImprovedLRM10");
        addLookupName("CLImpLRM10");
        heat = 4;
        rackSize = 10;
        minimumRange = 6;
        tonnage = 2.5f;
        criticals = 1;
        bv = 90;
        cost = 100000;
        shortAV = 6;
        medAV = 6;
        longAV = 6;
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
