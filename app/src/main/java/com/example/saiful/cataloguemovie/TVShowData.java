package com.example.saiful.cataloguemovie;

import java.util.ArrayList;

public class TVShowData {

    public static String[][] data = new String[][]{
            {   "Marvel's Iron Fist",
                    "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                    "61%",
                    "Released",
                    "English",
                    "55m",
                    "https://image.tmdb.org/t/p/w185_and_h278_bestv2/nv4nLXbDhcISPP8C1mgaxKU50KO.jpg",
                    "Action & Adventure",
                    "March 17, 2017",
                    "David Farr"
            },

            {   "Doom Patrol",
                    "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.  ",
                    "61%",
                    "Released",
                    "English",
                    "60m",
                    "https://image.tmdb.org/t/p/w185_and_h278_bestv2/nVN7Dt0Xr78gnJepRsRLaLYklbY.jpg",
                    "Action & Adventure",
                    "February 15, 2019",
                    "Jeremy Carver"
            },

            {   "Fairy Tail",
                    "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                    "64%",
                    "Released",
                    "Japanese",
                    "25m",
                    "https://image.tmdb.org/t/p/w185_and_h278_bestv2/58GKcwFV3lpVOGzybeMrrNOjHpz.jpg",
                    "Animation & Fantasy",
                    "October 12, 2009",
                    "-"
            },
            {   "Family Guy",
                    "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris.",
                    "65%",
                    "Released",
                    "English",
                    "22m",
                    "https://image.tmdb.org/t/p/w185_and_h278_bestv2/gBGUL1UTUNmdRQT8gA1LUV4yg39.jpg",
                    "Animation, Comedy",
                    "January 31, 1999",
                    "Seth MacFarlane"
            },
            {   "The Flash",
                    "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. ",
                    "67%",
                    "Released",
                    "English",
                    "44m",
                    "https://image.tmdb.org/t/p/w185_and_h278_bestv2/fki3kBlwJzFp8QohL43g9ReV455.jpg",
                    "Sci-Fi & Fantasy",
                    "October 7, 2014",
                    "Geoff & Andrew"
            },

            {   "Grey's Anatomy",
                    "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                    "63%",
                    "Released",
                    "English",
                    "43m",
                    "https://image.tmdb.org/t/p/w185_and_h278_bestv2/eqgIOObafPJitt8JNh1LuO2fvqu.jpg",
                    "Drama",
                    "March 27, 2005",
                    "Shonda Rhimes "
            },
            {   "Hanna",
                    "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film. ",
                    "64%",
                    "Released",
                    "English",
                    "50m",
                    "https://image.tmdb.org/t/p/w185_and_h278_bestv2/5nSSkcM3TgpllZ7yTyBOQEgAX36.jpg",
                    "Action & Adventure",
                    "March 28, 2019",
                    "David Farr "
            },
            {   "NCIS",
                    "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                    "67%",
                    "Released",
                    "English",
                    "45m",
                    "https://image.tmdb.org/t/p/w185_and_h278_bestv2/eoj15m14Zpf2bUWXqNIs7itZK9w.jpg",
                    "Action & Adventure",
                    "September 23, 2003",
                    "Don McGill, Donald P"
            },
            {   "Riverdale",
                    "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                    "69%",
                    "Released",
                    "English",
                    "45m",
                    "https://image.tmdb.org/t/p/w185_and_h278_bestv2/gskv297rlbyzLaTU1XZf8UBbxp0.jpg",
                    "Drama, Mystery",
                    "January 26, 2017",
                    "Roberto Aguirre"
            },
            {   "Shameless",
                    "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him.",
                    "78%",
                    "Released",
                    "English",
                    "60m, 55m",
                    "https://image.tmdb.org/t/p/w185_and_h278_bestv2/iRyQTp2L437k6zfFCvZSOWaxQFA.jpg",
                    "Drama, Comedy",
                    "January 9, 2011",
                    "Paul Abbott"
            }
    };
    public static ArrayList<TVShow> getListData(){
        ArrayList<TVShow> list = new ArrayList<>();
        for (String[] aData : data) {
            TVShow tvShow = new TVShow();
            tvShow.setTitle(aData[0]);
            tvShow.setOverview(aData[1]);
            tvShow.setUser_score(aData[2]);
            tvShow.setStatus(aData[3]);
            tvShow.setOriginal_language(aData[4]);
            tvShow.setRuntime(aData[5]);
            tvShow.setPhoto(aData[6]);
            tvShow.setGenre(aData[7]);
            tvShow.setDate_released(aData[8]);
            tvShow.setCrew(aData[9]);
            list.add(tvShow);
        }
        return list;
    }
}
