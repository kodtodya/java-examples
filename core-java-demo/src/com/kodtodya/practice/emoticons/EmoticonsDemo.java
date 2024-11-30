package com.kodtodya.practice.emoticons;

public class EmoticonsDemo {
	public static void main(String[] args) {
		String startPointEmoji = "🌀";

		// If the previous line doesn't show up in your editor,
		// you can comment it out and use this declaration instead:
		//String startPointEmoji = "\ud83c\udf00";

		int startpointEmojiCode = startPointEmoji.codePointAt(startPointEmoji.offsetByCodePoints(0, 0));

		System.out.println("\nSr.No.\tUnicode\t\tEmoticon\n" + "-".repeat(35));

		for (var i = 0; i < 1000; i++, startpointEmojiCode++) {
			char emotiocons[] = { Character.highSurrogate(startpointEmojiCode),
					Character.lowSurrogate(startpointEmojiCode) };

			System.out.print("\n" + i + "\t");
			for (char emoji : emotiocons)
				System.out.print(String.format("\\u%04x", (int) emoji));

			System.out.print("\t" + String.valueOf(emotiocons));
		}
	}
}