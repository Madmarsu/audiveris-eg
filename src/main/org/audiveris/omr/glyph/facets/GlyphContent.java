//----------------------------------------------------------------------------//
//                                                                            //
//                          G l y p h C o n t e n t                           //
//                                                                            //
//----------------------------------------------------------------------------//
// <editor-fold defaultstate="collapsed" desc="hdr">
//
// Copyright © Hervé Bitteur and others 2000-2017. All rights reserved.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//----------------------------------------------------------------------------//
// </editor-fold>
package org.audiveris.omr.glyph.facets;

import org.audiveris.omr.text.TextRoleInfo;
import org.audiveris.omr.text.TextWord;

import java.awt.Point;

/**
 * Interface {@code GlyphContent} defines a facet that deals with the
 * textual content, if any, of a glyph.
 *
 * @author Hervé Bitteur
 */
public interface GlyphContent
        extends GlyphFacet
{
    //~ Instance fields --------------------------------------------------------

    /** String equivalent of Character used for elision. (undertie) */
    String ELISION_STRING = new String(Character.toChars(8255));

    /** String equivalent of Character used for extension. (underscore) */
    String EXTENSION_STRING = "_";

    /** String equivalent of Character used for hyphen. */
    String HYPHEN_STRING = "-";

    //~ Methods ----------------------------------------------------------------
    /**
     * Report the manually assigned role, if any.
     *
     * @return the manual role for this glyph, or null
     */
    TextRoleInfo getManualRole ();

    /**
     * Report the manually assigned text, if any.
     *
     * @return the manual string value for this glyph, or null
     */
    String getManualValue ();

    /**
     * Report the current language, if any, defined for this glyph.
     *
     * @return the current glyph language code, or null
     */
    String getOcrLanguage ();

    /**
     * Report the starting point of this text glyph, which is the left
     * side abscissa and the baseline ordinate.
     *
     * @return the starting point of the text glyph, specified in pixels
     */
    Point getTextLocation ();

    /**
     * Report the text role of the textual glyph within the score.
     *
     * @return the role of this textual glyph
     */
    TextRoleInfo getTextRole ();

    /**
     * Report the string value of this text glyph if any.
     *
     * @return the text meaning of this glyph if any, which is the manual value
     *         if any, or the ocr value otherwise.
     */
    String getTextValue ();

    /**
     * Return the corresponding text word for this glyph, if any.
     *
     * @return the related text word, null otherwise.
     */
    TextWord getTextWord ();

    /**
     * Manually assign a text role to the glyph.
     *
     * @param manualRole the role for this text glyph
     */
    void setManualRole (TextRoleInfo manualRole);

    /**
     * Manually assign a text meaning to the glyph.
     *
     * @param manualValue the string value for this text glyph
     */
    void setManualValue (String manualValue);

    /**
     * Set the related text word.
     *
     * @param ocrLanguage the language provided to OCR engine for recognition
     * @param textWord    the TextWord for this glyph
     */
    void setTextWord (String ocrLanguage,
                      TextWord textWord);
}
