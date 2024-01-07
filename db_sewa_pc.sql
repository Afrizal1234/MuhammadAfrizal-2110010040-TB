-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Jan 2024 pada 09.13
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_sewa_pc`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `komputer`
--

CREATE TABLE `komputer` (
  `id_komputer` varchar(15) NOT NULL,
  `merk` varchar(15) NOT NULL,
  `tipe` text NOT NULL,
  `keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `komputer`
--

INSERT INTO `komputer` (`id_komputer`, `merk`, `tipe`, `keterangan`) VALUES
('KP001', 'ACER', 'ASPIRE ES1', 'BAIK'),
('KP002', 'ACER', 'ASPIRE E5', 'BAIK'),
('KP003', 'ACER', 'ASPIRE A5', 'BAIK'),
('KP004', 'APPLE', 'MACBOOK PRO', 'BAIK');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` varchar(10) NOT NULL,
  `nama_pelanggan` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `telp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama_pelanggan`, `alamat`, `telp`) VALUES
('PL001', 'DONO', 'JL. HARUAN NO.26', '081973649281'),
('PL002', 'KASINO', 'JL. PUYAU NO.01', '082561529074'),
('PL004', 'AFRIZAL', 'JL. TAUMAN NO.06', '089612346528');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `no_transaksi` varchar(15) NOT NULL,
  `tgl_transaksi` text NOT NULL,
  `nama_pelanggan` varchar(20) NOT NULL,
  `id_komputer` varchar(15) NOT NULL,
  `mulai` text NOT NULL,
  `selesai` text NOT NULL,
  `durasi` int(50) NOT NULL,
  `bayar` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`no_transaksi`, `tgl_transaksi`, `nama_pelanggan`, `id_komputer`, `mulai`, `selesai`, `durasi`, `bayar`) VALUES
('TS001', '07-01-2024 14:46', 'DONO', 'KP003', '07/01/2024', '09/01/2024', 2, 300000),
('TS002', '07-01-2024 15:53', 'AFRIZAL', 'KP003', '07/01/2024', '09/01/2024', 2, 400000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
