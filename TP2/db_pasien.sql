-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 16, 2023 at 02:17 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pasien`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_pasien`
--

CREATE TABLE `data_pasien` (
  `id` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `nik` int(15) NOT NULL,
  `no_bpjs` int(15) NOT NULL,
  `tanggalLahir` date DEFAULT NULL,
  `alamat` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_pasien`
--

INSERT INTO `data_pasien` (`id`, `nama`, `nik`, `no_bpjs`, `tanggalLahir`, `alamat`, `jenis_kelamin`) VALUES
(1, 'Andi', 202029, 4141, '2000-01-01', 'Pulogadung', 'laki-laki'),
(5, 'Rudy Mulyadi', 20198330, 60981, '1990-05-10', 'Bogor', 'laki-laki'),
(6, 'Heru', 129000987, 3144, '1995-04-10', 'Bandung', 'laki-laki'),
(7, 'Heru Priyambodo', 19888309, 4678, '1994-05-29', 'Solo', 'laki-laki'),
(8, 'Sulistyono', 883939013, 42666, '1998-08-19', 'Solo', 'laki-laki');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_pasien`
--
ALTER TABLE `data_pasien`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nik_unique` (`nik`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_pasien`
--
ALTER TABLE `data_pasien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
