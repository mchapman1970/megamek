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
package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.TechConstants;

/**
 * @author Ben Grills
 */
public class InfantrySupportLightMortarInfernoWeapon extends InfantryWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -3164871600230559641L;

    public InfantrySupportLightMortarInfernoWeapon() {
        super();
        techLevel.put(3071,TechConstants.T_ALLOWED_ALL);
        name = "Mortar (Light) - Inferno";
        setInternalName(name);
        addLookupName("InfantryLightMortarInferno");
        addLookupName("Infantry Light Mortar Inferno");
        ammoType = AmmoType.T_NA;
        cost = 1400;
        bv = 0.79;
        flags = flags.or(F_INFERNO).or(F_BALLISTIC).or(F_INF_SUPPORT);
        String[] modeStrings = { "Damage", "Heat" };
        setModes(modeStrings);
        infantryDamage = 0.26;
        infantryRange = 1;
        crew = 2;
        introDate = 1950;
        techLevel.put(1950,techLevel.get(3071));
        availRating = new int[]{RATING_C,RATING_C,RATING_C};
        techRating = RATING_B;
    }
}