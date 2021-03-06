/*
 * Java port of ffmpeg mpeg1/2 decoder.
 * Copyright (c) 2003 Jonathan Hueber.
 *
 * Copyright (c) 2000,2001 Fabrice Bellard.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * See Credits file and Readme for details
 */
package uk.ac.liv.ffmpeg.libavcodec.mpeg12;



/**
 * non intra picture macro block coded block pattern + mb type 
 */
public class MbPTypeVLC extends VLCTable {
    public MbPTypeVLC() {
        vlcCodes = new long[][] {
            { 3, 5 }, // 0x01 MB_INTRA
            { 1, 2 }, // 0x02 MB_PAT
            { 1, 3 }, // 0x08 MB_FOR
            { 1, 1 }, // 0x0A MB_FOR|MB_PAT
            { 1, 6 }, // 0x11 MB_QUANT|MB_INTRA
            { 1, 5 }, // 0x12 MB_QUANT|MB_PAT
            { 2, 5 }, // 0x1A MB_QUANT|MB_FOR|MB_PAT
        };
        createHighSpeedTable();
    }
}
