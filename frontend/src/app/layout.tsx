import type { Metadata } from "next";
import "./ui/globals.css";
import {roboto} from "./ui/fonts"

export const metadata: Metadata = {
  title: "Vistly",
  description: "An application dedicated to connecting businesses with influencers for events",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">

      <body className={`${roboto.className} antialiased`}>
        {children}
      </body>
    </html>
  );
}
