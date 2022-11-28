# ProjectCar
Celem projektu było zaprogramowanie symulacji działania samochodu. Program umożliwia wykonanie różnych akcji związanych z obsługą samochodu:
- włączenie i wyłączenie silnika,
- zmianę biegów,
- przyspieszenie i hamowanie,
- zmianę kierunku jazdy.

Parametry samochodu można obserwować na interfejsie użytkownika. Prędkość pojazdu zmienia się w zależności od obrotów silnika, a różne biegi charakteryzują się innym przełożeniem. Symulator posiada oprawę graficzną stworzoną przy pomocy klasy Graphics2D.

![Project: Car UML diagram](https://lh3.googleusercontent.com/fife/AAbDypAtsgm8MKOZTbfN-Svol6EzFEqBL8iBkVopNCa50ItOKyRt389BljZmvCBjWuMSCqrYKiWqhSx_BAiiI0fLoBoKpgTh-DTi0j3JRaXI0aznLTMfNFc8_8ibbDO4o3UKLGhPWkfdsSjnBR277z9yhWd1HUGYNvSdQfGaBoAeGJcB2jqVnBwA0f1UBZR21GWmOhkSb1dG41zYFlRbYlVsr8GljrNe3F4edXRtRuSOCRnng4hkSwoAZ-Y4eFF1DrhErc8DDeqphydt-57TFl6POjvVew68vgXvBvARf93jcO6MfoduS76gLTjzt-mBojAPX5oJrDq76Sm7Swt8ZkQG4DG_wUUGBjK65Y0m9sOt60KOfOZRCk4eKbVy8HAR4swVF5ojLjGfNRvUHUVrLjDGdCvt7jUoMK2jMDQOP71jkii-Ah1HOh6PxEdWOWvIgWhxhSMxTnLh6V9-rQVC3Tvub9VWdTSRWexnMpv9D4GiebObmhRMkpxyWqaygf4KG5BZVXS3q-nnjBbkYoyLRYz7l-lLgIg-IOyTjn86kUc6rnag-uCpEzSy0_tbt9BM_J0toTmvN0uJaYmt0Zz68u01j7_oWntj1yCE6HMPj-rpxAp5IJmFaOHD1n-qDHyKoSuoNyBsPGbED1PWYNmQny8S3vV3j91aCxb6H9x_locwO6IxfeDebH6DsKGD-JDMxDkE6BtWdEKKIoLYMkyRA0X8I2upxCJdIx5nV4No2E19jWaW-co_WDwd8FC6bnE8qG2mDdFLyK0Y3wBfR4KFAVQU9kdIAv2FQWvm-k03SqTlcm3WLe7VHd_tFDw7RloTinDxpyedNo9YO9ym70UdKgG33yDsPZz9-H4tnvds91UPm7KRziCrFmFYVWFDpCNmZuteV1RbVd-bME67omWP4o-Sy4VQluQYW1760I58KnOPBR2w_3QMCj1ku_kqkEo4i0y-zvdX7ksuz9T5SIMzV2SW0Muur8v5_V2EMY7J-yixfufuxmSCremFWq-bR7HKpJau35OF2z2OZ25-6Zeiej3A49sVHaJoyCmO1IlWsGo0rqc5c4Gn=w1920-h830)

![Project: Car User Manual](https://lh3.googleusercontent.com/fife/AAbDypAuKHo5hNKTvjMKhuBanxKx7ff5kcFxscPLWGS22DP7QiKLo51zHi7_-dQ6CWixl0E0XPu9KOzjKmHeaS6-tOE-OrQx8GlD3mhkXhiSrq9rI_yyhT3aTn0PWSrj9R4-xErKjt7Q0QC3smpr6IObHs1cJO54B65GgkbORFRrhdNzYAX8GE2Wo3NEiFRLDObPuKOVKRw3W2HbmFI_g8-MGz166dNe8ZJL9-YELw9Lhxbe3wnLFJINfy4S8Nxb-9eFgCwGThAa3OcgzGjFTkUlSsKjvYdPrEo0QWs2yF97JDcKpVrQU_al98JR_wpIoYOvLvSZdl6ciskEZNXsMZAZRDtlTboc-vK3cOzwsjdptaqTq3eUPoe11fj6Tou7nPne0XNWLqpjd_E5e8Qmidt_jUfmZEf5cd8XQixOOlfGfzYspQKumooaiZsrj6CS-tY7x5yH2zecODtU_B8bl5q7sgVtawdRKBtKNh0qe4IhVPj8WAmHmwxMSpWA9gAEeXPzD6ZWKk8Do3ar8R2BOlrw9FNDnX5Ny6WocEckKoz-ZEEgUegL3jDXVN9AmmEgVIQgyewsVea5IyAt7pqwt4HwS05wCU3h4iMx3_Ejf4fzi8DDDKkWUiT9wsEQMbbXpWs-MWCv7p37CZPHqjry8E9SHergLpKbsOx3MhFrG0AnBpXgXW3lR6A4OaDR8TDeoaoCptXKUnBw_GithG_nZQ9CLB2ooP4_vGsxPm8heew9jKSm14I10TKu_dtQll3SclGPql7IKEn0pkfa6di_yEf5zwgV2PRxDIqvGwaOaAylRbbRTzPiOqAnDewXUZuwCFJJ6QSSZlcXNU_Ju3Iro6y6MoqTKdUnHsgPcZmF1jQT-8UM6OcqNzXvASnORs8GQy6uDxC5pM8kcAj005yFMpCQkTSkFWtIANBLPXUy_CbRen9xKGmbH4TX7q5c0rK4v34sR_gjvvXsq49Lc79SZYcRSnd1Cle9MqmC5z9wfoPEd8EAxG-95F98YpD-xqmpG8tjL0dtaLZQRAsaMaVRCfu6XUb7RdjwfP7MGG3zk7Pdaf_XYYju3o8zcTlU7MaL3fC_zWMFbGXs9P2YDWlg0C8PlymUXc0LFHvWGKaGZRU1RYmKvM4b6h07sOzE8WjLLt7nLMV7gHcfvgGQO-MqLhC8BaPYHKp8hamwlDRTP_R-T5YDQhA02VgvAqeQ7u1EVUvJOc8qTpsMtOWp4B_P2mVCVem5kirmbhh66MZ6qFlyLnwBmoUibdY-n2c-vOCLif_SM5Jn74uR6HBLZ0np1MFHmw-uf5jHniEptQ7ISMk4fr1kiSUOEjqcLJq2FW2ZfZpk1A5awtFEPesKl9Y1vd_O2thO52utpEbe8JPicL36qDA1aPIpF0r6S7Hx_7D_Yl5fZ72lN0TBH1FKNzDqV0WRJbcYhndyRHt-Per0_jWhTTADSyzRBGyUnCtqpSujVl7jqg5m3KYepml3tTJAd-qTE6_-80aTK__9euxqjjAhnAnPMjbMTZcrSfQfjdxieFLlop50fRAEkx9bTt9AI4zd0juFkH84bC63PUbVclhRuGTQsh6HsvcSW4VMKxySI5wD=w1920-h830)
