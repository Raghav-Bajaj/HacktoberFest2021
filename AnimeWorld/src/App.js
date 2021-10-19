import React from 'react';
import Header from './components/Header';
import Sidebar from './components/Sidebar';
import { useState, useEffect } from 'react';
import Maincontent from './components/Maincontent';

import './assets/css/main.css';

function App() {

             // anime list
    const [animeList, SetAnimeList]  = useState([]);
    // best anime list
    const [topAnime, SetBestAnime] = useState([]);
    // search variable
    const [search, SetSearch] = useState("");

    const GetTopAnime  = async()=>{
      const temp = await fetch(`https://api.jikan.moe/v3/top/anime/1/bypopularity`).then(res => res.json());

      SetBestAnime(temp.top.slice(0,5));

    }
    console.log(topAnime);
    useEffect(()=>{GetTopAnime(); console.log(topAnime)},[])

    // handle search results

    const HandleSearch = (e)=>{
        e.preventDefault();
        // console.log(search);
        FetchAnime(search);
    }

    const FetchAnime =async(query)=>{
      const temp = await fetch(`https://api.jikan.moe/v3/search/anime?q=${query}&order_by=title&sort=asc&limit=10`).then(res => res.json());
      console.log(temp.results);
      SetAnimeList(temp.results);

    }


  return (
    <div>
      <Header />
      
      <div className="content-wrap">
        <Sidebar topAnime = {topAnime} />
        <Maincontent  HandleSearch ={HandleSearch} search={search} SetSearch={SetSearch} animeList ={animeList}/>

      </div>


    </div>
  );
}

export default App
