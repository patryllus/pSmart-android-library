package org.kenyahmis.psmartlibrary.Readers;

import org.kenyahmis.psmartlibrary.Models.WriteResponse;

/**
 * Created by GMwasi on 2/13/2018.
 */

public class AudioJackCardReader implements CardReader {
    @Override
    public byte[] ReadCard() {
        return new byte[0];
    }

    @Override
    public WriteResponse WriteCard(byte[] data) {
        return null;
    }
}
