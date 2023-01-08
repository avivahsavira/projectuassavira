-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 08 Jan 2023 pada 05.02
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `crud_daspro`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `crud_uas`
--

CREATE TABLE `crud_uas` (
  `id` int(15) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `nik` int(16) NOT NULL,
  `jabatan` varchar(255) NOT NULL,
  `no_hp` int(15) NOT NULL,
  `alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `crud_uas`
--

INSERT INTO `crud_uas` (`id`, `nama`, `nik`, `jabatan`, `no_hp`, `alamat`) VALUES
(1, 'Jamal', 123, 'Mafia', 321, 'Pluto');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `crud_uas`
--
ALTER TABLE `crud_uas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `crud_uas`
--
ALTER TABLE `crud_uas`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
