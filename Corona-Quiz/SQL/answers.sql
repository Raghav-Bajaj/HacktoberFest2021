-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: sql311.byetcluster.com
-- Generation Time: Oct 07, 2021 at 12:13 PM
-- Server version: 5.7.35-38
-- PHP Version: 7.2.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `epiz_26548248_subs`
--

-- --------------------------------------------------------

--
-- Table structure for table `answers`
--

CREATE TABLE `answers` (
  `aid` int(250) NOT NULL,
  `answer` varchar(250) DEFAULT NULL,
  `ans_id` int(250) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `answers`
--

INSERT INTO `answers` (`aid`, `answer`, `ans_id`) VALUES
(1, 'Through droplets that come from your mouth and nose when you cough or breathe out', 1),
(2, 'Through Garbage and stagnant water', 1),
(3, 'By drinking unclean water', 1),
(4, 'All of the above', 1),
(5, 'A new and continuous cough', 2),
(6, 'Fever', 2),
(7, 'Tiredness', 2),
(8, 'All of the above', 2),
(9, 'No – not everyone with COVID-19 has symptoms', 3),
(10, 'Yes – it will be obvious, a person with COVID-19 coughs a lot', 3),
(11, 'Yes – you can tell just by where a person comes from, their race and ethnicity', 3),
(12, 'None of These', 3),
(13, 'Yes – but only if you use a strong bleach', 4),
(14, 'Yes – normal soap and water or hand sanitizer is enough', 4),
(15, 'No – Washing your hands doesn’t stop COVID-19', 4),
(16, 'None of these', 4),
(17, 'Children', 5),
(18, 'Older people – especially those aged 70 and above', 5),
(19, 'People with certain underlying health conditions', 5),
(20, 'European people', 5),
(21, 'You stop going to crowded places and visiting other people’s houses', 6),
(22, 'You stop talking to the people you live with', 6),
(23, 'You stop speaking to your friends on the phone', 6),
(24, 'All of the above', 6);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `answers`
--
ALTER TABLE `answers`
  ADD PRIMARY KEY (`aid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `answers`
--
ALTER TABLE `answers`
  MODIFY `aid` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
