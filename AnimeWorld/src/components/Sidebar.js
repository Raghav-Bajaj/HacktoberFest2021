import React from 'react'
import '../assets/css/main.css';



function Sidebar({topAnime}) {

   

    return (
        <aside>
            <nav>
                <h3>Best Anime to Watch</h3>
                {topAnime.map(anime =>(
                    <a href={anime.url} target="_blank" key={anime.mal_id} rel="noreferrer">{anime.title}</a>
                ))}
                
                
            </nav>
        </aside>
    )
}

export default Sidebar
