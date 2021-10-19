import React from 'react'
import AnimeCard from './AnimeCard'


function Maincontent(props) {
    return (
        <main>
            <div className="main-head">
                <form className='search-box'
                    onSubmit={props.HandleSearch}
                >
                    <input  type="search" placeholder="Attack on Titan" required
                       value ={props.search} onChange={e=> props.SetSearch(e.target.value)}
                        />
                </form>
            </div>
            <div className="anime-list">
                {props.animeList.map(e =>(
                    <AnimeCard 
                    anime ={e}
                    key={e.mal_id}

                    />
                ) )}
            </div>
        </main>
    )
}

export default Maincontent
