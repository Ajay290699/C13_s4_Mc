package com.niit.C13_s4_Mc.service;

import com.niit.C13_s4_Mc.domain.Track;
import com.niit.C13_s4_Mc.exception.TrackNotFoundException;

import java.util.List;

public interface ITrackService {

    public Track addTrack(Track track);
    public List<Track> getAllTrack();
    public String deleteTrack(int id) throws TrackNotFoundException;

    public List<Track> getAllTrackByRating(double rating);

    public List<Track> getAllTrackByArtistName(String artistName);
}