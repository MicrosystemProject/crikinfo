package com.crick.apis.services;

import com.crick.apis.entites.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    List<Match> getAllMatches();

    List<Match>getLiveMatches();

    List<List<String>> getpointTable();



}
