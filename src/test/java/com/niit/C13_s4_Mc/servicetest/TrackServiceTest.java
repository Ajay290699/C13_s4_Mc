package com.niit.C13_s4_Mc.servicetest;

import com.niit.C13_s4_Mc.domain.Artist;
import com.niit.C13_s4_Mc.domain.Track;
import com.niit.C13_s4_Mc.repository.TrackRepository;
import com.niit.C13_s4_Mc.service.TrackServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TrackServiceTest {

    @Mock
    TrackRepository trackRepository;

    @InjectMocks
    TrackServiceImpl trackService;

    Track track;
    Artist artist;

    @BeforeEach
    public void setUp() {
        this.artist = new Artist(312, "Rakesh");
        this.track = new Track(548, "Hosoor", 5.2, artist);
    }

    @AfterEach
    public void tearDown() {
        this.artist = null;
        this.track = null;
    }
}
